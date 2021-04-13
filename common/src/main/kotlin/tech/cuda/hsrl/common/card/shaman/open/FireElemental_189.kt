package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FireElemental_189 : Card() {
    override val id = 189
    override val name = "火元素"
    override val description = "<b>战吼：</b>造成4点伤害。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Legacy1635
    override val background = "他从来不洗澡。嗯..."
    override val artist = "Ralph Horsley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e9fd8d606d6148ff29e7246fa1ca566ba40075db8261deda9c73c4466a4ca1da.png"
}
