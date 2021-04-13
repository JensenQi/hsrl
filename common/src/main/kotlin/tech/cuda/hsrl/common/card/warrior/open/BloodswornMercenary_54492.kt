package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BloodswornMercenary_54492 : Card() {
    override val id = 54492
    override val name = "血誓雇佣兵"
    override val description = "<b>战吼：</b>选择一个受伤的友方随从，召唤一个它的复制。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "你看起来真的很受伤，找个朋友来陪你吧！"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/20852bba4bcf8c071a6bbf26d9fd1de94714a5f3fdec95335c7e63ed0b2c75f1.png"
}
