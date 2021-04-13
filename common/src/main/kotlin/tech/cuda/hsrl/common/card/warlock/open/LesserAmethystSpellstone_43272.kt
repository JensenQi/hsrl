package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LesserAmethystSpellstone_43272 : Card() {
    override val id = 43272
    override val name = "小型法术紫水晶"
    override val description = "<b>吸血</b> 对一个随从造成 3点伤害。<i>（受到来自你的卡牌的伤害后升级。）</i>"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "“阿扎里将紫色的石头送给黑暗之心，只有最渴求力量的人才能得到。第一个拥抱黑暗的是术士林恩，得到石头后他就杀死了同袍。”——《魔石》"
    override val artist = "Mike Azevedo"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ac596334820830cb4c32136a3d8c29e9d2cd0a3ecf0a1d7aac3cd91394ec3b5a.png"
}
