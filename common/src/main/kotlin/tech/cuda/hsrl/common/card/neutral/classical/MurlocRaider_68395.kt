package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MurlocRaider_68395 : Card() {
    override val id = 68395
    override val name = "鱼人袭击者"
    override val description = ""
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "姆啦啦咯哈姆噶啊啊嘎，姆啦嘎嘎咯，啵啦啦嗯嘞噶哈，姆啦嗝，咯啦哈哈吧啦咯。加尔鲁什咯嘛啦喝，嘛啦咯呵！"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e6695117839c362f11d1ba4c5d0f41f05ed828676b862862a3191185fd2dd396.png"
}
