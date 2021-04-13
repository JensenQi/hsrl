package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class QuestingExplorer_53947 : Card() {
    override val id = 53947
    override val name = "奋进的探险者"
    override val description = "<b>战吼：</b>如果你控制一个<b>任务</b>，抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "任务要求她一次性上缴十二只斑马蹄，这些徽章还真是来之不易。"
    override val artist = "Maria Alexeevna Trepalina"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3f180e707e9e74f63dcee7f2001ec49c543dc58d25b521960ace2d244e436367.png"
}
