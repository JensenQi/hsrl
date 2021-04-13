package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RazaTheChained_40323 : Card() {
    override val id = 40323
    override val name = "缚链者拉兹"
    override val description = "<b>战吼：</b>如果你的牌库里没有相同的牌，则在本局对战中，你的英雄技能的法力值消耗为（0）点。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Msog
    override val background = "能帮我解开这些锁链吗？我会好好报答你的！"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2fafa1de20aa6a2c92ef3446fce5af547b64d9762005fae5f72d003142a3be60.png"
}
