package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CorridorCreeper_43515 : Card() {
    override val id = 43515
    override val name = "通道爬行者"
    override val description = "如果这张牌在你的手牌中，每当一个随从死亡，法力值消耗就减少（1）点。"
    override var cost: Int? = 7
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "它喜欢死去的生物的味道。真是奇怪，看上去它好象连鼻子都没有。"
    override val artist = "Nick Southham"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/947d4fc05396d3510701bb5cb72ee18310a6fd94a1b05092711222bb55c5664e.png"
}
