package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ForkedLightning_299 : Card() {
    override val id = 299
    override val name = "叉状闪电"
    override val description = "随机对两个敌方随从造成 2点伤害，<b>过载：</b>（2）"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Legacy3
    override val background = "配上勺状闪电和刀状闪电，你就集齐整套闪电餐具了。"
    override val artist = "Ralph Horsley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bacc39d3432fcbf230cb7b9e01958c2b08bde18bc0dd49867f2d694c3ae15148.png"
}
