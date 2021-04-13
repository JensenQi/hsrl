package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Shudderwock_48111 : Card() {
    override val id = 48111
    override val name = "沙德沃克"
    override val description = "<b>战吼：</b>重复在本局对战中你所使用过的所有其他卡牌的<b>战吼</b>效果<i>（目标随机而定）</i>。"
    override var cost: Int? = 9
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.TheWitchwood
    override val background = "吵吵机器人和闹闹机器人加起来都没它吵闹得厉害。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8ad163ead033117055afe408fd4439244cc4c4affc6fc82c1fb5458392d42077.png"
}
