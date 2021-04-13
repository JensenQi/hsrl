package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArgentWatchman_2505 : Card() {
    override val id = 2505
    override val name = "银色警卫"
    override val description = "无法攻击。 <b>激励：</b>在本回合中可正常进行攻击。"
    override var cost: Int? = 2
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "银色警卫负责监督，那么谁来监督他们呢？"
    override val artist = "Ben Zhang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6803feddf3da8d992dc762daf5d16851872e10f38198a2419ec4566abff03580.png"
}
