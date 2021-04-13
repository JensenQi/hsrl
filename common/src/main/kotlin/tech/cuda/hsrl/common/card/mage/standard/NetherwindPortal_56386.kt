package tech.cuda.hsrl.common.card.mage.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NetherwindPortal_56386 : Card() {
    override val id = 56386
    override val name = "虚空之风传送门"
    override val description = "<b>奥秘：</b>在你的对手施放一个法术后，随机召唤一个法力值消耗为（4）的随从。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.AshesOfOutland
    override val background = "凭虚御风，不知其所止。"
    override val artist = "Adam Byrne"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/76f038a0de8b73f04499994e98189109f7f19fb904c108da5007b36980773acc.png"
}
