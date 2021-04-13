package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArchsporeMsshifn_56689 : Card() {
    override val id = 56689
    override val name = "孢子首领姆希菲"
    override val description = "<b>嘲讽</b> <b>亡语：</b>将“终极姆希菲”洗入你的牌库。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.AshesOfOutland
    override val background = "孢子村英勇的首领。奉行的人生哲学是：人不犯姆们，姆们不犯人。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/468edbeb1618614a646b9f1796a8bed3b59195c31488a879c1c253125a13e8a1.png"
}
