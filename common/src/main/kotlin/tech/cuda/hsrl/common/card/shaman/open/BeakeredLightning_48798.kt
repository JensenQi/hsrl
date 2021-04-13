package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BeakeredLightning_48798 : Card() {
    override val id = 48798
    override val name = "瓶装闪电"
    override val description = "对所有随从造成 1点伤害。 <b>过载：</b>（2）"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.BoomsdayProject
    override val background = "在萨满祭司实验室工作只有一个要求，那就是——稳。"
    override val artist = "Evgeniy Dlinnov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5bd3d467685e03b2fece904ce557c00e634db8451308fa2c614e3d0fb668dc3e.png"
}
