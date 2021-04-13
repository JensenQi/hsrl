package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MurlocKnight_2655 : Card() {
    override val id = 2655
    override val name = "鱼人骑士"
    override val description = "<b>激励：</b>随机召唤一个鱼人。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Tgt
    override val background = "嘿嘿！瞧瞧他那双可爱的小脚。"
    override val artist = "Sam Nielson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5e61c70e9bd316e2f047e6046750bccb36b3a3d26b357c064fafd2d58d9b3d9e.png"
}
