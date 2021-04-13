package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Cutpurse_2766 : Card() {
    override val id = 2766
    override val name = "窃贼"
    override val description = "每当该随从攻击一方英雄，会将幸运币置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Tgt
    override val background = "他做窃贼可不是为了收集钱袋，而是里面的真金白银！"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/80a4719a8e1d6e4ba83135e01e326501ff3784c35cd9e9b551ccccdff53c7472.png"
}
