package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DragoncallerAlanna_46499 : Card() {
    override val id = 46499
    override val name = "巨龙召唤者奥兰纳"
    override val description = "<b>战吼：</b>在本局对战中，你每施放过一个法力值消耗大于或等于（5）点的法术，便召唤一个5/5的龙。"
    override var cost: Int? = 9
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "召唤巨龙的秘密很简单：只要轻声细语，再拿一包热狗出来就行。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/be917807cc283d4f54d389ac508daa7ddb1c2c9a58545ae0a2f5a1d615369001.png"
}
