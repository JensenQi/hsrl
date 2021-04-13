package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RamWrangler_2552 : Card() {
    override val id = 2552
    override val name = "暴躁的牧羊人"
    override val description = "<b>战吼：</b>如果你控制任何野兽，则随机召唤一个野兽。"
    override var cost: Int? = 5
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Tgt
    override val background = "驯养公羊最重要的技巧，就是别被它踩到。"
    override val artist = "Brandon Kitkouski"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/88061e4a4cfe07a34a832841395e27b8874efc230e8559b96b1e0edb48793b1c.png"
}
