package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SigilOfFlame_62845 : Card() {
    override val id = 62845
    override val name = "烈焰咒符"
    override val description = "在你的下个回合开始时，对所有随从造成 3点伤害。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "“这个符号的意思是火。那你想知道火是什么意思吗？”"
    override val artist = "Vlad Botos"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c954078f50c69d595c56b75955213d7d14361eca3cdc48232ff2099dd4a2a1d4.png"
}
