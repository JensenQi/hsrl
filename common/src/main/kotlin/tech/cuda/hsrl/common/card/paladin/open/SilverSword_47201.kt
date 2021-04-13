package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SilverSword_47201 : Card() {
    override val id = 47201
    override val name = "银剑"
    override val description = "在你的英雄攻击后，你的所有随从获得+1/+1。"
    override var cost: Int? = 8
    override var health: Int? = null
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.TheWitchwood
    override val background = "银虽然质地较软，不适合用来做锋利的武器……但是它好看呀！"
    override val artist = "Nutchapol Thitinunthakorn"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/eb74e943dec155954319b5db1eed4e676d8019b367e81b1473816df9b0a473c7.png"
}
