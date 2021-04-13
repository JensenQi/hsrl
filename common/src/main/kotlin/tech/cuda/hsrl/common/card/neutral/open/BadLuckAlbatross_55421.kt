package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BadLuckAlbatross_55421 : Card() {
    override val id = 55421
    override val name = "厄运信天翁"
    override val description = "<b>亡语：</b>将两张1/1的信天翁洗入你对手的 牌库。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "在传说故事里，对它造成伤害会招致厄运。所以轻轻地摸摸它的头就可以了，好吗？"
    override val artist = "Melvin Chan"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a344f0eba91fa9c05ec169c1d87088642e019bcd4b2909560cfd2c78e85d09b9.png"
}
