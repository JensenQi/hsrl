package tech.cuda.hsrl.common.card.druid.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FaireArborist_61462 : Card() {
    override val id = 61462
    override val name = "马戏团树艺师"
    override val description = "<b>抉择：</b>抽一张牌；或者召唤一个2/2的树人。<b>腐蚀：</b>同时拥有两种效果。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "腐树之下，岂有完果。"
    override val artist = "MAR Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5a9231a8053ec88e99d2b2c5347b7d9ea0392eaae8b43d47605f99032f7abbe4.png"
}
