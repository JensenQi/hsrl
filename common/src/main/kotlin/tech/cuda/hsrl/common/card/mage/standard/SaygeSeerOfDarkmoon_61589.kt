package tech.cuda.hsrl.common.card.mage.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SaygeSeerOfDarkmoon_61589 : Card() {
    override val id = 61589
    override val name = "暗月先知赛格"
    override val description = "<b>战吼：</b>抽 张牌。<i>（在本局对战中，每触发一个友方<b>奥秘</b>都会升级！）</i>"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "我们之间不存在秘密……更不存在退款这种事。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5da862f7e30a30a1e9142d08dda577e9edc08fc0b04aa240d32d324bc751fbeb.png"
}
