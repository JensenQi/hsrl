package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DeathwingDragonlord_38943 : Card() {
    override val id = 38943
    override val name = "黑龙领主死亡之翼"
    override val description = "<b>亡语：</b>将你手牌中所有的龙牌置入战场。"
    override var cost: Int? = 10
    override var health: Int? = 12
    override var attack: Int? = 12
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "这回死亡之翼听取了大家的意见，他不再单打独斗，而是以团队合作的方式重新出现在战场上。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fbfd4bf6bdf00910780c39347bd3fa0126c01701736051749eb0ed0d8734ddf5.png"
}
