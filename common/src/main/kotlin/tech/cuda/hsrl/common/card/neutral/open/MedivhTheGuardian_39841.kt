package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MedivhTheGuardian_39841 : Card() {
    override val id = 39841
    override val name = "守护者麦迪文"
    override val description = "<b>战吼：</b> 装备埃提耶什，守护者的传说之杖。"
    override var cost: Int? = 8
    override var health: Int? = 7
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Karazhan
    override val background = "麦迪文为了让自己的派对更热闹，便联络古尔丹，打开了黑暗之门……"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f68f7eaa8e7082f1da0a67b4fc78de103dfa18c1004d63e8d09ef6580f18ef4f.png"
}
