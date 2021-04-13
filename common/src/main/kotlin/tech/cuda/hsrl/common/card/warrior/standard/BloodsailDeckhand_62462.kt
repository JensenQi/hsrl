package tech.cuda.hsrl.common.card.warrior.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BloodsailDeckhand_62462 : Card() {
    override val id = 62462
    override val name = "血帆桨手"
    override val description = "<b>战吼：</b>你的下一张武器牌的法力值消耗减少（1）点。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Core
    override val background = "海盗打劫其实也算“打折”。"
    override val artist = "Vika Yarova"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bf08030d68edc6742dee65855112fdf598046d9d832a52b6dffcbc2d6a2f28f4.png"
}
