package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MissileLauncher_48552 : Card() {
    override val id = 48552
    override val name = "飞弹机器人"
    override val description = "<b>磁力</b> 在你的回合结束时，对所有其他角色造成1点伤害。"
    override var cost: Int? = 6
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "因其在发射时会有撕裂空气般的尖啸声，故而又被称作“砰砰博士的管风琴”。"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2eb7b2a9b7448d637d9d76162f39139f05bad264a76bb4da8ab1eb6c202a2340.png"
}
