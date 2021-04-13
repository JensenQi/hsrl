package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArathiWeaponsmith_538 : Card() {
    override val id = 538
    override val name = "阿拉希武器匠"
    override val description = "<b>战吼：</b>装备一把2/2的武器。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Legacy3
    override val background = "拳套武器限时特惠，第二把半价！"
    override val artist = "Samwise"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6f7a56be4f8defc08b0364c54bb078657f582434c5aeb92d343323796df51ffd.png"
}
