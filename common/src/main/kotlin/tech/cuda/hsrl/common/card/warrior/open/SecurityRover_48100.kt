package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SecurityRover_48100 : Card() {
    override val id = 48100
    override val name = "安保巡游者"
    override val description = "每当该随从受到伤害，召唤一个2/3并具有<b>嘲讽</b>的机械。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.BoomsdayProject
    override val background = "侦测到危险源。呼叫警卫。"
    override val artist = "Adam Byrne"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0751b60da32fe5481ff195394d0bb32f0f2c3d039bacf1b6eea36cab7d5d6016.png"
}
