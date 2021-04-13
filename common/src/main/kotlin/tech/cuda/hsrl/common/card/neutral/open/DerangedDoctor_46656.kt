package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DerangedDoctor_46656 : Card() {
    override val id = 46656
    override val name = "癫狂的医生"
    override val description = "<b>亡语：</b>为你的英雄恢复 8点生命值。"
    override var cost: Int? = 8
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "他的博士文凭是在鱼人大学拿到的。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3659f7e4ceba2be473aa5de2e7c9c1f8ef11e4d871de79f74207a3f99f05d05c.png"
}
