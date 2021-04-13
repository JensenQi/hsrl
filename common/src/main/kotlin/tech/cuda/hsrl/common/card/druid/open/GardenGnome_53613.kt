package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GardenGnome_53613 : Card() {
    override val id = 53613
    override val name = "园艺侏儒"
    override val description = "<b>战吼：</b>如果你的手牌中有法力值消耗大于或等于（5）点的法术牌，便召唤两个2/2的树人。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "“你好啊，我的小树树……该洗澡澡啦。”"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/15150dfe60dad2b3f6294f8383738e7d9909b3491912d8a446979aa5f73ebdae.png"
}
