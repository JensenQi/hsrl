package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LightsChampion_2259 : Card() {
    override val id = 2259
    override val name = "圣光勇士"
    override val description = "<b>战吼：</b> <b>沉默</b>一个恶魔。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "恶魔说：“当我的邻居变得唠唠叨叨时，我第一个想到的是求助圣光勇士。”"
    override val artist = "Andrea Uderzo"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0b3d2e5f2ec2cc751694d3f7c614b1c801073ced28d54936432fbfdf5b3110f5.png"
}
