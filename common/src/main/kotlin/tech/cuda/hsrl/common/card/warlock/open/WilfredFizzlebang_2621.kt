package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WilfredFizzlebang_2621 : Card() {
    override val id = 2621
    override val name = "威尔弗雷德·菲兹班"
    override val description = "你通过英雄技能抽到的卡牌，其法力值消耗为（0）点。"
    override var cost: Int? = 6
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Tgt
    override val background = "他能召唤任何东西，甚至是恐怖末日守卫。 他对自己的召唤结果总是充满了信心。"
    override val artist = "Tooth"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bc9394eee2c10b228eda950c060f7f2702a3d987892554d6bb7127bdbe5bd7f3.png"
}
