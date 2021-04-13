package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ElvenArcher_389 : Card() {
    override val id = 389
    override val name = "精灵弓箭手"
    override val description = "<b>战吼：</b>造成1点伤害。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "媚眼如丝，轻盈如燕，致命如箭。"
    override val artist = "Steve Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b4c5bdf432a24916d593fcb4d30ef4cc1ea9a748ac751d0d08473225f185e64b.png"
}
