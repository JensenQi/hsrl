package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UltimateInfestation_42759 : Card() {
    override val id = 42759
    override val name = "终极感染"
    override val description = "造成 5点伤害。抽五张牌。获得5点护甲值。召唤一个5/5的食尸鬼。"
    override var cost: Int? = 10
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Kotf
    override val background = "您预订的食尸鬼五合一大礼包正在送货途中，一切正常。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e3638bd6407b67dc456ceb4d66fba8a4cd885af0ae6672264404b9da31ce34b8.png"
}
