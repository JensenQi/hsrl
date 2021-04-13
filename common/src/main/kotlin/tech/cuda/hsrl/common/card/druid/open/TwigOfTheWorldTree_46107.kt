package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TwigOfTheWorldTree_46107 : Card() {
    override val id = 46107
    override val name = "世界之树的嫩枝"
    override val description = "<b>亡语：</b>获得十个法力水晶。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "喜欢在公会活动中划水的德鲁伊专用。"
    override val artist = "Alexey Aparin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bfcd765e2ca79808725924689736374a45c8ee20e6cc43b035c972df2d11b66a.png"
}
