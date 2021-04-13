package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpikedHogrider_40700 : Card() {
    override val id = 40700
    override val name = "野猪骑士斯派克"
    override val description = "<b>战吼：</b>如果一个敌方随从具有<b>嘲讽</b>，便获得<b>冲锋</b>。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "斯派克经常参加加基森举办的沙漠拉力赛，并获奖无数。"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/22e960805d5b2ec90911216512abac6d233e4421a78c538fa9936f151ebd9d54.png"
}
