package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TheRunespear_46305 : Card() {
    override val id = 46305
    override val name = "符文之矛"
    override val description = "在你的英雄攻击后，<b>发现</b>一张法术牌，并向随机目标施放。"
    override var cost: Int? = 8
    override var health: Int? = null
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "当有人问牛头人铁匠这些符文有什么用时，铁匠憨笑着回答：“什么都能做一点……”"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/351d048b500970b20ac5c75d85e09394b39b7c76f223d42f9c0cf46ee4680db1.png"
}
