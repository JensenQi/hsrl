package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SightlessWatcher_56973 : Card() {
    override val id = 56973
    override val name = "盲眼监视者"
    override val description = "<b>战吼：</b>检视你牌库中的三张牌。选择一张置于牌库顶。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.Legacy1635
    override val background = "他是看不见，但他可以用触手摸。"
    override val artist = "Jaemin Kim"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/41b4dd3d4387d07543a342bc0670d04c78e8519760d3b011e699b93d6f4ba6a8.png"
}
