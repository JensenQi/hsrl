package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WhackAGnollHammer_61227 : Card() {
    override val id = 61227
    override val name = "敲狼锤"
    override val description = "在你的英雄攻击后，随机使一个友方随从获得+1/+1。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "霍格最痛恨的娱乐项目。"
    override val artist = "Jason Kang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/891c2cf62284327edbe599849bca65a27e5a398d6450eac0cdfaea7d1bda1d44.png"
}
