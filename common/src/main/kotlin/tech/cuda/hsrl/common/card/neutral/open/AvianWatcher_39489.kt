package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AvianWatcher_39489 : Card() {
    override val id = 39489
    override val name = "鸟禽守护者"
    override val description = "<b>战吼：</b>如果你控制一个<b>奥秘</b>，便获得+1/+1和<b>嘲讽</b>。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Karazhan
    override val background = "浪漫喜剧类节目是他的最爱。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ee13455639ba76feab7588b3dfdcb2622dfdfdd4a26e08a8c50179081235ccd7.png"
}
