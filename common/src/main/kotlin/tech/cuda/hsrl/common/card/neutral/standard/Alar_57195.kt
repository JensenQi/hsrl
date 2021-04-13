package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Alar_57195 : Card() {
    override val id = 57195
    override val name = "奥"
    override val description = "<b>亡语：</b>召唤一个0/3的可以在你的下个回合 复活该随从的“奥的灰烬”。"
    override var cost: Int? = 5
    override var health: Int? = 3
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.AshesOfOutland
    override val background = "679周：依然没出坐骑……"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f722ee3668a3d08d13cd6402714749edf1012a8c1fb9585341e675b8b27d5188.png"
}
