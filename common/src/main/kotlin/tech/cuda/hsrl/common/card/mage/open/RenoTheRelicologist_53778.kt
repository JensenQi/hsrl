package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RenoTheRelicologist_53778 : Card() {
    override val id = 53778
    override val name = "考古专家雷诺"
    override val description = "<b>战吼：</b>如果你的牌库里没有相同的牌，则造成10点伤害，随机分配到所有敌方随从身上。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "终其一生，雷诺·杰克逊和古往今来第一法师之间只有一把加特林法杖的距离。"
    override val artist = "Eric Braddock"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0aebd7642f2ef09adbf7a9eccae8b07dbd40547e6962cc150aa8101b9ff3c547.png"
}
