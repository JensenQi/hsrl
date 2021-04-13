package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UmbralSkulker_55094 : Card() {
    override val id = 55094
    override val name = "幽影潜藏者"
    override val description = "<b>战吼：</b>如果你已经<b>祈求</b>过两次，则将三个幸运币置入你的手牌。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.DescentOfDragons
    override val background = "“就三个金币？！你知道这条任务线有多长吗？”"
    override val artist = "Maria Trepalina"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/60393a04e8ca05477950d99c7a70006eb614456eae61908c43ccdd55bcb40d58.png"
}
