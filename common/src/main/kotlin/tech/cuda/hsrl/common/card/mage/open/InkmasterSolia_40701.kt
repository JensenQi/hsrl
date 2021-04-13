package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class InkmasterSolia_40701 : Card() {
    override val id = 40701
    override val name = "墨水大师索莉娅"
    override val description = "<b>战吼：</b>在本回合中，如果你的牌库里没有相同的牌，你所施放的下一个法术的法力值消耗为（0）点。"
    override var cost: Int? = 7
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Msog
    override val background = "暗金教教徒的纹身几乎由索莉娅一手包办。它们不仅可以赋予教徒神秘的魔法力量，还能有效防范敌对家族的卧底渗透。"
    override val artist = "J. Ejsing & E. Amundsen"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b8feb7d4f4e4ad11f85a846176b7e89db0e5f9ef3cf27b4811442c69d0a67ed6.png"
}
