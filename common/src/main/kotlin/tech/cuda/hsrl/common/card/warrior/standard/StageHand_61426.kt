package tech.cuda.hsrl.common.card.warrior.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StageHand_61426 : Card() {
    override val id = 61426
    override val name = "置景工"
    override val description = "<b>战吼：</b>随机使你手牌中的一张随从牌获得+1/+1。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "总有观众乱动道具台，他只好台上台下一把抓。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f3c512a6e9eecd86f8baa32100a71f1cfc93e82fe1af7491953ea17442563f82.png"
}
