package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AzeriteElemental_52415 : Card() {
    override val id = 52415
    override val name = "艾泽里特元素"
    override val description = "在你的回合开始时，获得<b>法术伤害+2</b>。"
    override var cost: Int? = 5
    override var health: Int? = 7
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "它就像是艾泽拉斯的血栓。"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7a2cec289d4f1f700d9191f7b492f9b52d8d4722a96c1eb78cbb6e48aec34e65.png"
}
