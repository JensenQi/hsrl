package tech.cuda.hsrl.common.card.warrior.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RingmasterWhatley_61248 : Card() {
    override val id = 61248
    override val name = "马戏领班威特利"
    override val description = "<b>战吼：</b>抽一张机械牌，龙牌和海盗牌。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "他能胜任领班，主要是因为他跟所有人，或者说所有东西都合得来。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e51fe5b4f90aa2717713eaf87fc5a26852407d4be21a8b61369239f6af4dbd2a.png"
}
