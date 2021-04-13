package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DarkWispers_2009 : Card() {
    override val id = 2009
    override val name = "黑暗私语"
    override val description = "<b>抉择：</b> 召唤5个小精灵；或者使一个随从获得+5/+5和<b>嘲讽</b>。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Gvg
    override val background = "别担心，我们已经把命名这张牌的家伙给开除了。"
    override val artist = "Trent Kaniuga"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8d93b8e414d9914c9ce4b841a1bd1cee348316806ab16ed2d334cc388ca84d72.png"
}
