package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FelfirePotion_40517 : Card() {
    override val id = 40517
    override val name = "邪火药水"
    override val description = "对所有角色造成 5点伤害。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Msog
    override val background = "卡扎库斯为了赶工期，把不少工作懈怠的小鬼丢进了坩埚里。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ba2873e9415aaa870439982bf89a40053282e81a58f88bb13488b3bc6c3a447f.png"
}
