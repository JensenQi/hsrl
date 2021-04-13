package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WeaponizedWasp_53973 : Card() {
    override val id = 53973
    override val name = "武装胡蜂"
    override val description = "<b>战吼：</b>如果你控制一个<b>跟班</b>，造成3点 伤害。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "砰砰博士就一个要求：在胡蜂头上安装激光发射器。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/38e8a030425be68c09404ca4b7c58f29a444962f12073b084fbcddcaaf89a800.png"
}
