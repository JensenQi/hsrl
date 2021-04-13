package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FlurryRank1_62804 : Card() {
    override val id = 62804
    override val name = "冰风暴（等级1）"
    override val description = "随机<b>冻结</b>一个敌方随从。<i>（当你有5点法力值时升级。）</i>"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "冰风暴。冰风暴！冰！风！暴！"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8cc2cb7e54c9d873e22c2a3e54cb203df0506e6df6f29f7879d01981fe2b6472.png"
}
