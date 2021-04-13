package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MurlocRaider_191 : Card() {
    override val id = 191
    override val name = "鱼人袭击者"
    override val description = ""
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "姆啦啦咯哈姆噶啊啊嘎，姆啦嘎嘎咯，啵啦啦嗯嘞噶哈，姆啦嗝，咯啦哈哈吧啦咯。加尔鲁什咯嘛啦喝，嘛啦咯呵！"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bad7d8b29aac28d5ea57877a7d0c69bfd52a4347a2fc540f9df3cfc8cfd5017e.png"
}
