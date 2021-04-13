package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GoruTheMightree_55031 : Card() {
    override val id = 55031
    override val name = "强力巨树格鲁"
    override val description = "<b>嘲讽，战吼：</b>在本局对战的剩余时间内，你的树人获得+1/+1。"
    override var cost: Int? = 7
    override var health: Int? = 10
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.DescentOfDragons
    override val background = "战斗到底，永不认树。"
    override val artist = "Steve Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/175f6cde5a9e5e0d7fb1bc196e42e1dbd5df2a853216c6a3ac400d606688187f.png"
}
