package tech.cuda.hsrl.common.card.warlock.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SoulRend_63192 : Card() {
    override val id = 63192
    override val name = "灵魂撕裂"
    override val description = "对所有随从造成 5点伤害。每消灭一个随从，便摧毁你牌库中的一张牌。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "灵魂离你有多远，“负罪感”三个字就离术士有多远。"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/eb7df83319a648c6c45331eadfc4e75dea609e0399714b63c8bb3069bcc3d812.png"
}
