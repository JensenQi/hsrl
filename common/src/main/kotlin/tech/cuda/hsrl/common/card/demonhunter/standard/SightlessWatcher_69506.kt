package tech.cuda.hsrl.common.card.demonhunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SightlessWatcher_69506 : Card() {
    override val id = 69506
    override val name = "盲眼监视者"
    override val description = "<b>战吼：</b>检视你牌库中的三张牌。选择一张置于牌库顶。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.Core
    override val background = "他是看不见，但他可以用触手摸。"
    override val artist = "Jaemin Kim"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/74137c72d0b673b022c3bcb6cd3dc071501bc53ee5af0caabe31ccc18772c204.png"
}
